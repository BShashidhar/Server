package cdacteamproject.BussinessLayerHome;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDaoConnection extends JpaRepository<Admin, Integer>{

	

}