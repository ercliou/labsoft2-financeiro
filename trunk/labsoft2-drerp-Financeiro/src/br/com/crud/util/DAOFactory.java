package br.com.crud.util;

import org.hibernate.Session;

import br.com.crud.dao.EntidadeDAO;
import br.com.crud.dao.EntidadeDAOImpl;
import br.com.drerp.financeiro.dao.login.LoginDAO;
import br.com.drerp.financeiro.dao.login.LoginDAOImpl;
import br.com.drerp.financeiro.dao.transferencia.RequisicaoTransferenciaDAO;
import br.com.drerp.financeiro.dao.transferencia.RequisicaoTransferenciaDAOImpl;
import br.com.drerp.financeiro.dao.transferencia.TransferenciaDAO;
import br.com.drerp.financeiro.dao.transferencia.TransferenciaDAOImpl;

public class DAOFactory {
	
	public static EntidadeDAO createEntidadeDAO(){
		EntidadeDAO entidadeDAO = new EntidadeDAOImpl();
		entidadeDAO.setSession(getSession());
		return entidadeDAO;
	}
	
	public static TransferenciaDAO createTransferenciaDAO(){
		TransferenciaDAO transferenciaDAO = new TransferenciaDAOImpl();
		transferenciaDAO.setSession(getSession());
		return transferenciaDAO;
	}
	
	public static RequisicaoTransferenciaDAO createRequisicaoTransferenciaDAO(){
		RequisicaoTransferenciaDAO requisicaoTransferenciaDAO = new RequisicaoTransferenciaDAOImpl();
		requisicaoTransferenciaDAO.setSession(getSession());
		return requisicaoTransferenciaDAO;
	}
	
	public static LoginDAO createLoginDAO(){
		LoginDAO loginDAO = new LoginDAOImpl();
		loginDAO.setSession(getSession());
		return loginDAO;
	}
	
	private static Session getSession(){
		return HibernateUtil.getSessionFactory().getCurrentSession();
	}
}
