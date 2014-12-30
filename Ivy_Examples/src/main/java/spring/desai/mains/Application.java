package spring.desai.mains;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Application {

	public static final Logger log = LogManager.getLogger("mainAppLogger");

	// public static final Log log = LogFactory.getLog("mainAppLogger");

	// public static final org.apache.logging.log4j.Logger log4j2 =
	// org.apache.logging.log4j.LogManager
	// .getLogger("");

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
//				Config.class);
////
//		Connection conn = null;
//		try {
//
//			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=test";
//			String user = "sa";
//			String pass = "Password01";
//			conn = DriverManager.getConnection(dbURL, user, pass);
//			if (conn != null) {
//				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
//				System.out.println("Driver name: " + dm.getDriverName());
//				System.out.println("Driver version: " + dm.getDriverVersion());
//				System.out.println("Product name: "
//						+ dm.getDatabaseProductName());
//				System.out.println("Product version: "
//						+ dm.getDatabaseProductVersion());
//			}
//
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		} finally {
//			try {
//				if (conn != null && !conn.isClosed()) {
//					conn.close();
//				}
//			} catch (SQLException ex) {
//				ex.printStackTrace();
//			}
//		}

		
//		String[] beans = context.getBeanDefinitionNames();
//
//		for (int i = 0; i < beans.length; i++) {
//			System.out.println("bean: " + beans[i]);
//			log.info("bean: " + beans[i]);
//			// log4j2.info("log4j2 info");
//		}
//		Tutor tutor = (Tutor) context.getBean("tutorBean");
//		TutorDao tutorDao = (TutorDao) context.getBean("tutorDao");
//
//		Student student = (Student) context.getBean("studentBean");
//		StudentDao studentDao = (StudentDao) context.getBean("studentDao");
//
//		Subject subject = (Subject) context.getBean("subjectBean");
//		SubjectDao subjectDao = (SubjectDao) context.getBean("subjectDao");
//
//		Tutor tutor2 = (Tutor) context.getBean("tutorBean2");
//
//		Student student2 = (Student) context.getBean("studentBean2");
//
//		Subject subject2 = (Subject) context.getBean("subjectBean2");
//
//		subjectDao.insert(subject);
//		subjectDao.insert(subject2);
//
//		tutorDao.insert(tutor);
//		tutorDao.insert(tutor2);
//
//		studentDao.insert(student);
//		studentDao.insert(student2);
//
//		System.out.println(studentDao.findById(1));
//		System.out.println(studentDao.findByName("student 1"));
//		System.out.println(studentDao.countAll());
//		System.out.println(studentDao.findAssociatedSubjects(1));
//
//		System.out.println(tutorDao.findById(1));
//		System.out.println(tutorDao.findByName("tutor 2"));
//		System.out.println(tutorDao.countAll());
//
//		System.out.println(tutorDao.findSubjectOfTutor(6));
//
//		System.out.println(subjectDao.findAllTutorsForSubject(1));
//
//		System.out.println(subjectDao.findById(1));
//
//		// subjectDao.dropById(2);
//		// studentDao.dropById(2);
//		// tutorDao.dropById(3);
//
//		if (log.isInfoEnabled())
//			log.info("info");
//		if (log.isDebugEnabled())
//			log.debug("debug", new RuntimeException());
//		if (log.isEnabledFor(Level.ERROR))
//			log.error("error", new RuntimeException());
//		if (log.isEnabledFor(Level.FATAL))
//			log.fatal("fatal", new RuntimeException());
//		if (log.isTraceEnabled())
//			log.trace("trace");
//
//		context.registerShutdownHook();
//		context.close();
	}
}
