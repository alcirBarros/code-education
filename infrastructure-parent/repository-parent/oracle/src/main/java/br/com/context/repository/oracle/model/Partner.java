package br.com.context.repository.oracle.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TCOB_PARCR")
public class Partner extends EntityBase {

	@Id
	@Column(name = "ID_PARCR")
	private Long id;

	@Column(name = "NU_CNPJ")
	private String cnpj;

	@Column(name = "DS_RZ_SCIAL")
	private String companyName;

	@Column(name = "DS_NM_PARCR")
	private String name;

	@Column(name = "NU_CEP")
	private String zipCode;

	@Column(name = "DS_EN")
	private String address;

	@Column(name = "DS_COMPL")
	private String complement;

	@Column(name = "DS_CIDDE")
	private String city;

	@Column(name = "DS_URL_RETOR")
	private String returnUrl;

	@Column(name = "DS_URL_REDIR")
	private String redirectUrl;

	@Column(name = "VR_TX")
	private Long taxValue;

	@Column(name = "VR_TARIF")
	private Long tariffValue;

	@Column(name = "NU_PZ")
	private Long paymentTerm;

}
