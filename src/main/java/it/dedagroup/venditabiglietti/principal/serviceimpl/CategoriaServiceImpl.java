package it.dedagroup.venditabiglietti.principal.serviceimpl;

import org.springframework.stereotype.Service;

import it.dedagroup.venditabiglietti.principal.dto.request.AggiungiCategoriaDtoRequest;
import it.dedagroup.venditabiglietti.principal.service.CategoriaServiceDef;
import it.dedagroup.venditabiglietti.principal.service.GeneralCallService;

@Service
public class CategoriaServiceImpl implements CategoriaServiceDef, GeneralCallService {

	@Override
	public void aggiungiCategoria(AggiungiCategoriaDtoRequest request) {
		String path = "http://localhost:8082/categoria/aggiungicategoria";
		callPost(path, null, request , Void.class);
		
	}

	
	
}
