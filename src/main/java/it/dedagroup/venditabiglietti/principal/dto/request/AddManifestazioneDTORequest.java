package it.dedagroup.venditabiglietti.principal.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddManifestazioneDTORequest {
    private String nome;
    private long idCategoria;
    private long idUtente;
}
