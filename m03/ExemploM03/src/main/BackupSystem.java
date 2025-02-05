package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Uma empresa quer implementar um novo sistema de backup no qual arquivos são guardados em fitas de dados.

O novo sistema deve seguir as duas seguintes regras:
1 - Nunca colocar mais de dois arquivos na mesma fita.
2 - Os arquivos não podem ser divididos entre múltiplas fitas.

É garantido que todas as fitas tenham o mesmo tamanho e que elas sempre serão capazes de guardar o maior arquivo.
Toda vez que esse processo for executado, nós já saberemos o tamanho de cada arquivo e a capacidade das fitas.
Com isso em mente, desenhe uma solução que seja capaz de contar quantas fitas serão requeridas para guardar o backup da forma mais eficiente.
O parâmetro de sua função será uma estrutura que contém o tamanho dos arquivos e a capacidade das fitas.
Você deve retornar a quantidade mínima de fitas requerida para guardar os arquivos.

Exemplo:

Input: Tape Size = 100; Files: 70, 10, 20
Output: 2
*/

public class BackupSystem {
    public interface Batch {
        int[] getFilesSizes();
        int getTapeSize();
    }
    
    private static class NewBatch implements Batch {

		@Override
		public int[] getFilesSizes() {
			return new int[] {
					70, 10, 20, 40, 50, 60, 50, 100, 100
			};
		}

		@Override
		public int getTapeSize() {
			return 100;
		}
    }
    
    private class Tape {
    	private int stored;
    	private int numberOfFiles;
    	
    	public Tape(int stored) {
    		this.stored = stored;
    		this.numberOfFiles = 1;
    	}
    	
    	public int getStored() {
    		return stored;
    	}
    	
    	public void addStorage(int storage) {
    		this.stored += storage;
    	}
    	
    	public int getNumberOfFiles() {
    		return numberOfFiles;
    	}
    	
    	public void addFiles() {
    		this.numberOfFiles++;
    	}
    }
    
    public int getMinimumTapeCount(final Batch batch) {
        // Primeiro, ordenamos o array de tamanhos
    	int[] sizes = batch.getFilesSizes();
    	Arrays.sort(sizes);

    	int tapes = 0;
    	List<Tape> list = new ArrayList<>();
    	
    	for (int i = sizes.length - 1; i > -1; i--) {
    		boolean stored = false;
    		
    		for (Tape tape : list) {
    			if (((tape.getStored() + sizes[i]) <= batch.getTapeSize()) && (tape.getNumberOfFiles() < 2)) {
    				tape.addStorage(sizes[i]);
    				tape.addFiles();
    				stored = true;
    				break;
    			}
    		}
    		
    		if (!stored) {
    			tapes++;
    			list.add(new Tape(sizes[i]));
    		}
    		
    	}
    	
        return tapes;
    }
    
    public static void main(String[] args) {
    	BackupSystem backupSystem = new BackupSystem();
    	Batch batch = new NewBatch();
    	
    	System.out.println(backupSystem.getMinimumTapeCount(batch));
    }
}
