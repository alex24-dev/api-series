package br.com.empresa.api.series.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
