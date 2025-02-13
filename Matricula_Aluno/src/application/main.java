package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.aluno;
import entities.disciplina;

public class main {
	public static void main(String[] args) {
		
		List<disciplina> Disciplinas = new ArrayList<disciplina>();
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\20241012000638\\Documents\\Matriculas\\Disciplinas"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Seja bem vindo!");
//cadastro aluno
		System.out.println("Qual seu nome: ");
		String alunonome = scr.next();
		
		System.out.println("Qual sua matricula de aluno: ");
		String matriculaaluno = scr.next();
		
		aluno Aluno = new aluno(alunonome, matriculaaluno);
		
		
		
		System.out.println(alunonome);
		System.out.println(matriculaaluno);
		
	}

}
