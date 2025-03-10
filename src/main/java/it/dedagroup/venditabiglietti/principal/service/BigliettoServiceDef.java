package it.dedagroup.venditabiglietti.principal.service;

import it.dedagroup.venditabiglietti.principal.dto.request.AddBigliettoDTORequest;
import it.dedagroup.venditabiglietti.principal.dto.request.ModifyBigliettoDTORequest;
import it.dedagroup.venditabiglietti.principal.dto.response.BigliettoMicroDTO;
import java.time.LocalDate;
import java.util.List;

public interface BigliettoServiceDef {
    //TODO Discutere della distribuzione dei metodi nel service layer
    public BigliettoMicroDTO saveBiglietto(AddBigliettoDTORequest biglietto);
    public BigliettoMicroDTO modifyBiglietto(ModifyBigliettoDTORequest biglietto);
    public void deleteByBiglietto(long id_biglietto);

    public BigliettoMicroDTO findById(long id_biglietto);
    public List<BigliettoMicroDTO> findAll();
    public BigliettoMicroDTO findByIdAndIdUtente(long id_biglietto, long id_utente);
    public BigliettoMicroDTO findBySeriale(String seriale);
    public List<BigliettoMicroDTO> findAllByPrezzoIsGreaterThanEqual(double prezzo);
    public List<BigliettoMicroDTO> findAllByPrezzoIsLessThanEqual(double prezzo);
    public List<BigliettoMicroDTO> findAllByIdUtente(long id_utente);
    public List<BigliettoMicroDTO> findAllByDataAcquisto(LocalDate dataAcquisto);
    public BigliettoMicroDTO findByIdAndIdPrezzoSettoreEvento(long id_biglietto, long id_prezzoSettoreEvento);
    public List<BigliettoMicroDTO> findAllByIdPrezzoSettoreEventoOrderByPrezzoAsc(long id_prezzoSettoreEvento);

    public int countByIdPrezzoSettoreEventoAndDataAcquistoIsNotNull(long id_prezzoSettoreEvento);
    public List<Double> findDistinctPrezzoBigliettoByIdPrezzoSettoreEvento(long id_prezzoSettoreEvento);
    public int countByIdPrezzoSettoreEventoAndDataAcquistoIsNotNullAndPrezzo(long id_prezzoSettoreEvento, double prezzo);

    public List<BigliettoMicroDTO> findAllByIdPrezzoSettoreEventoIn(List<Long> idsPrezzoSettoreEvento);
}
