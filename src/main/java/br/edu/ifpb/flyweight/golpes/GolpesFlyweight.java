package br.edu.ifpb.flyweight.golpes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class GolpesFlyweight {

	private static Map<String, Golpe> golpes = new HashMap<>();

	private GolpesFlyweight() {
		iniciarGolpes();
	}

	 private static void iniciarGolpes() {
		golpes.put("soco", new Soco());
		golpes.put("soquinho", new Soquinho());
		golpes.put("uppercut", new UpperCut());
		golpes.put("frontal", new Frontal());
		golpes.put("cruzadoDireita", new CruzadoDireita());
		golpes.put("cruzadoEsquerda", new CruzadoEsquerda());
		golpes.put("cotovelada", new Cotovelada());
		golpes.put("chute", new Chute());
	 }

	public static Golpe getGolpe(String nomeGolpe) throws GolpeInexistenteException {
		if(golpes.containsKey(nomeGolpe))
			return golpes.get(nomeGolpe);
		throw new GolpeInexistenteException();
	}

}
