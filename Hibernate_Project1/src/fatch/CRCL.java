
package fatch;

import java.util.List;

import max.dao.UserDTO;

public class CRCL {
public static void main(String[] args) {
	ViewDAO viewDAO=new ViewDAO();
	//UserDTO p = viewDAO.getDataByCreteriya(8);
	//System.out.println(p.getTid()+" "+p.getName()+" "+p.getAdd());
	List<UserDTO> list = viewDAO.getDataByCreteriya();
	// for
	
}
}
