package enlaceDeDatos;

import java.util.*;

import redis.clients.jedis.Jedis;


/**
 * 
 */
public class ConexionBaseDatosRedis {

	private static Jedis baseDatosRedis;
	private static final String  STRINGCONEXION = "pub-redis-15866.dal-05.1.sl.garantiadata.com";
	private static final int     PUERTO         = 15866;
	private static final String  CONTRASENA     = "pepe1196";
	
    /**
     * Default constructor
     */
    public ConexionBaseDatosRedis() {   	
    	baseDatosRedis = new Jedis(STRINGCONEXION, PUERTO);
    	 baseDatosRedis.auth(CONTRASENA);
    }
    
    public void insertarDatos(String pClave,String pPregunta, String pRespuesta)
    {
    	baseDatosRedis.lpush(pClave, pPregunta , pRespuesta);
    }
    
    public void obtenerDatos(String pClave)
    {
        List<String> list = baseDatosRedis.lrange(pClave, 0 ,100);
        for(int i=0; i<list.size(); i++) {
          System.out.println("categoria: "+list.get(i));
          }
    }

}