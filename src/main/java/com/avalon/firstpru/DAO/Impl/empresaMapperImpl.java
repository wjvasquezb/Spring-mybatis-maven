package com.avalon.firstpru.DAO.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.avalon.firstpru.DAO.empresaMapper;
import com.avalon.firstpru.entity.empresa;
import com.avalon.firstpru.util.MyBatisUtil;
@Repository
public class empresaMapperImpl implements empresaMapper {

	public List<empresa> getEmpresa(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<empresa> employeesList = session.selectList("getempresa");
		session.commit();
		session.close();
		return employeesList;
}
}