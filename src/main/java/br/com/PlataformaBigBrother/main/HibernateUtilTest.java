package br.com.PlataformaBigBrother.main;

import org.hibernate.Session;

import br.com.PlataformaBigBrother.util.HibernateUtil;

public class HibernateUtilTest {
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
	}
}
