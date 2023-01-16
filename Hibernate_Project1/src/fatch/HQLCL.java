package fatch;

import java.util.List;

import max.dao.UserDTO;

public class HQLCL {
	public static void main(String[] args) {
		ViewDAO viewDAO=new ViewDAO();
		List<UserDTO> b = viewDAO.getData();
		for(UserDTO t:b)
		{
			System.out.println(t.getTid()+" "+t.getName()+" "+t.getAdd());
		}
	}

}
