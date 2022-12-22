package luutkha.fs.query.creation.dto.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CurrencyConvertDTO {
    private Double USD_VND;

    private Double VND_USD;
}
