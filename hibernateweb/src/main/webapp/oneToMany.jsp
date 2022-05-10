<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="org.hibernate.*,org.hibernate.boot.registry.*,
                    org.hibernate.cfg.Configuration,
                    com.wipro.velocity.Question,
                    com.wipro.velocity.Answer,
                    javax.persistence.TypedQuery,
                    java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OnetoMany</title>
</head>
<body>
<h1> One To Many Demo</h1>
<%
Configuration cfg = new Configuration();
cfg.configure("hibernate.cfg.xml");
// Hibernate 5 Way of initialising the Session factory
SessionFactory factory=cfg.buildSessionFactory(new 
        StandardServiceRegistryBuilder().configure().build());
Session sess= factory.openSession();
Transaction t = sess.beginTransaction();

Answer ans1=new Answer();    
ans1.setAnswername("Hibernate is a ORM tool");    
ans1.setPostedBy("Chaitanya");    
    
Answer ans2=new Answer();    
ans2.setAnswername("Hibernate implements JPA");    
ans2.setPostedBy("Ravi");    
    
Answer ans3=new Answer();    
ans3.setAnswername("Angular is used to create single page applications");    
ans3.setPostedBy("vamsi");    
    
Answer ans4=new Answer();    
ans4.setAnswername("Angular is a platform to built mobile and desktop web applictions");    
ans4.setPostedBy("Vishnu");    
    
ArrayList<Answer> list1=new ArrayList<Answer>();    
list1.add(ans1);    
list1.add(ans2);    
    
ArrayList<Answer> list2=new ArrayList<Answer>();    
list2.add(ans3);    
list2.add(ans4);    
    
Question question1=new Question();    
question1.setQname("What is Hibernate?");    
question1.setAnswers(list1);    
    
Question question2=new Question();    
question2.setQname("What is Angular?");    
question2.setAnswers(list2);    
    
sess.persist(question1);    
sess.persist(question2);    
    
t.commit();    
// session.close();    
out.println("success");    

%>
</body>
</html>