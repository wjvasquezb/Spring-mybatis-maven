package com.avalon.firstpru.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.avalon.firstpru.entity.empresa;
import com.avalon.firstpru.util.MyBatisUtil;



public interface empresaMapper {

	
	public List<empresa> getEmpresa();
}
