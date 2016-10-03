package enlaceDeDatos;

import java.util.*;

import redis.clients.jedis.Jedis;


/**
 * 
 */
public class BaseDatos {

	private Jedis baseDatosRedis;
    /**
     * Default constructor
     */
    public BaseDatos() {   	
    	baseDatosRedis = new Jedis("pub-redis-15866.dal-05.1.sl.garantiadata.com",15866);
    	 baseDatosRedis.auth("pepe1196");
    }
    
    public void insertarDatos(String pClave,String pPregunta, ArrayList<String> pRespuestas)
    {
    	for(int i = 0; i<pRespuestas.size();i++)
    	{
    		baseDatosRedis.lpush(pClave, pPregunta , pRespuestas.get(i));
    	}
    	
      /*  List<String> list = baseDatosRedis.lrange(pClave, 0 ,100);
        for(int i=0; i<list.size(); i++) {
          System.out.println("categoria: "+list.get(i));}*/
   
    }

}