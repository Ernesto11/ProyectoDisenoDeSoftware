package logicaDePresentacion;

import java.util.ArrayList;
import java.util.List;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

import enlaceDeDatos.BaseDatos;
import redis.clients.jedis.Jedis;

public class Principal {

	public static void main(String[] args) {
		
		
		BaseDatos p = new BaseDatos();
	    ArrayList<String> pe = new ArrayList<String>();
	    pe.add("Saprissa");
	    pe.add("Liga");
	    pe.add("Cartago");
	    p.insertarDatos("Equipo", "Futbol", pe);
        //jedis.lpush("prueba", "p1","tipo algo");
        //jedis.lpush("prueba", "p1","tipo algo 2");
        //jedis.lpush("prueba", "p2","Abstraccion");

        

   
        
	     /* RedisClient redisClient = new RedisClient(
	              RedisURI.create("redis://pepe1196@pub-redis-15866.dal-05.1.sl.garantiadata.com:15866"));
	          RedisConnection<String, String> connection = redisClient.connect();
	          System.out.println("Connected to Redis using SSL");
	         
	          connection.set("key", "pepe");

	          connection.lpush("key", "Hello, Redis!");
	         
	          
	          List<String> list = connection.lrange("key", 0 ,1);
	          for(int i=0; i<list.size(); i++) {
	            System.out.println("nombre: "+list.get(i));
	          }
	     

	          connection.close();
	          redisClient.shutdown();*/
		
		
		
	}

}
