package com.synechron.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BankAccount {

	@Id
	@Column(name="accountNo")
	private Integer accountNo;
	@Column(name="bankId")
	private Integer bankId;
	@Column(name="bankName")
	private String bankName;
	@Column(name="bankBranch")
	private String bankBranch;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="mobile")
	private Long mobile;
	@Column(name="address")
	private String address;
	@Column(name="ifsc_code")
	private String ifsc_code;
}
