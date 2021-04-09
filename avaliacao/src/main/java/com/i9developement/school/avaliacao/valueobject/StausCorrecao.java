package com.i9developement.school.avaliacao.valueobject;

public enum StausCorrecao {

	APROVADO(1, "A"), REPROVVADO(2, "R"), REENTREGA(3, "RT");

	private int codigo;
	private String descricao;

	private StausCorrecao(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static StausCorrecao toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (StausCorrecao x : StausCorrecao.values()) {
			if (codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inválido" + codigo);
	}

}
