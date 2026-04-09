package project.com.user.management.service;

import java.util.List;

import project.com.user.management.dto.UsersRequestDto;
import project.com.user.management.dto.UsersResponseDto;
import project.com.user.management.entity.Users;

public interface UsersService {
	String register(UsersRequestDto user);
	UsersResponseDto searchUser(Long id);
	List<UsersResponseDto> viewAllUsers();
	String updateUser(Users user);
	String deleteUser(Long id);
}
