package kodlamaio.Kodlama.io.Devs.business.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateTechnologyRequest {
	@NotNull
	@NotBlank
	private String name;
	
	@NotNull
	private int languageId;

}
