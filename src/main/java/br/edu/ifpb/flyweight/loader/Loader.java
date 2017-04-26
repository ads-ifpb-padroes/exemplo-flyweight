package br.edu.ifpb.flyweight.loader;

import static br.edu.ifpb.flyweight.golpes.GolpesFlyweight.getGolpe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.edu.ifpb.flyweight.golpes.Golpe;
import br.edu.ifpb.flyweight.golpes.GolpeInexistenteException;

public class Loader {
	
	public static void main(String[] args) throws GolpeInexistenteException {
		
		List<Golpe> combo1 = Arrays.asList(getGolpe("soquinho"), 
				getGolpe("soquinho"), getGolpe("chute"));
		
		for (Golpe golpe : combo1) {
			System.out.println(golpe);
		}
		
		List<Golpe> combo2 = new ArrayList<>();
		combo2.add(getGolpe("chute"));
		combo2.add(getGolpe("soquinho"));
		combo2.add(getGolpe("soquinho"));
		
		for (Golpe golpe : combo2) {
			System.out.println(golpe);
		}
	}

}
