package br.com.fabio.userapi.converter;

import br.com.fabio.userapi.dto.UserDTO;
import br.com.fabio.userapi.model.User;

public class DTOConverter {
	
	public static UserDTO convert(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setNome(user.getNome());
		userDTO.setEndereco(user.getEndereco());
		userDTO.setCpf(user.getCpf());
		userDTO.setEmail(user.getEmail());
		userDTO.setTelefone(user.getTelefone());
		userDTO.setDataCadastro(user.getDataCadastro());
		return userDTO;
	}
		
}
