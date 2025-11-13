/*  Annotations
 *  São meios de comunicar ao compilar oque deve ser feito 
 *  ( Metadados )
 * 
 *  public @interface MinhaAnnotation {
 *      String value();
 * } 
 * 
 *  @MinhaAnnotation("Exemplo")
 *  public class MinhaClasse {
 *      // codigo da classe
 * }
 * 
 * Utilização: anotação de classe, métodos, variáveis, parâmetros, e etc; 
 * 
 * Exemplo: @Deprecated, @SupressWarnings, @Override
 *  e permite fazer pesonalizadas 
 * 
 * public @interface MinhaAnnotation {
 *      String value();
 *      int numero() default 0; // boas praticas -> sempre definir um default
 * }
 * 
 * @MinhaAnnotation(value = "Exemplo", numero = 42)
 * public class MinhaClasse {
 *      // Codigo da classe
 * } 
 * 
 * Processamento de Annotations em tempo de execução -> 
 * 
 * -> Utilização de reflexão (java.lang.reflect) para acessar as annotations
 * 
 * Class<?> classe = MinhaClasse.class;
 * MinhaAnnotation annotation = classe.getAnnotation(MinhaAnnotation.class);
 * 
 * String valor = annotation.value();
 * 
 * int numero = annotation.numero();
 * 
 * Class<?> classe = MinhaClasse.class;
 * Method[] metodos = classe.getDeclaredMethods(); -> pega todos os methodos  
 * Field[] atributos = classe.getDeclaredFields(); -> pega todos os atributos 
 *   
 * 
 * Class<?> classe = MinhaClasse.class;
 * 
 * Annotaion[] annotations = 
 * classe.getAnnotations();
 * 
 * boolean possuiAnnotation = 
 * classe.isAnnotationPresent(MinhaAnnotation.class);
 * 
 * 
 * @Retention(RetentionPolicy.RUNTIME) -> definição de uma retenção
 * @Target (ElementType.METHOD) -> definição de alvos especificos 
 * public @interface MinhaAnnotation {
 *      // Elementos da annotation 
 * }
 * 
 * Bibliotecoas e Frameworks Populares  
 * 
 * @RestController
 * @RequestMapping("\api")
 * public class MeuController {
 *      // Codigo do controller 
 * }
 * 
 *  @Test 
 * 
 * 
 */

public class Annotations {

}
