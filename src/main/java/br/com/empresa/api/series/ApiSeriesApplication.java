package br.com.empresa.api.series;

import br.com.empresa.api.series.model.DadosEpisodio;
import br.com.empresa.api.series.model.DadosSerie;
import br.com.empresa.api.series.model.DadosTemporada;
import br.com.empresa.api.series.principal.Principal;
import br.com.empresa.api.series.service.ConsumoApi;
import br.com.empresa.api.series.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApiSeriesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiSeriesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.exibeMenu();

		/*ConsumoApi consumoApi = new ConsumoApi();
		String json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=7dc3e117");
		System.out.println(json);

		ConverteDados converterDados = new ConverteDados();
		DadosSerie dadosSerie = converterDados.obterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);

		String outroJson = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=7dc3e117");
		DadosEpisodio dadosEpisodio = converterDados.obterDados(outroJson,DadosEpisodio.class);
		System.out.println(dadosEpisodio);*/

		List<DadosTemporada> listaTemporada = new ArrayList<>();

/*
		for (int i = 1; i <= dadosSerie.totalTemporadas() ;i++){
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=7dc3e117");
			DadosTemporada dadosTemporada  = converterDados.obterDados(json,DadosTemporada.class);
			listaTemporada.add(dadosTemporada);
		}

		listaTemporada.forEach(System.out::println);
*/

		System.out.println("------------------");

//		for (DadosTemporada temporada: listaTemporada) {
//			json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" +  "&apikey=7dc3e117");
//			DadosTemporada dadosTemporada  = converterDados.obterDados(json,DadosTemporada.class);
//			listaTemporada.add(dadosTemporada);
//		}
//
//		listaTemporada.forEach(System.out::println);
	}
}
