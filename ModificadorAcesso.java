/* Organização de Classes em Pacotes -> Evitar conflito de nome e organiza o agrupamento logico 
 *  "packages"
 * 
 * package com.exemple.projeto;
 * 
 * public class Classe1 {
 * // codigo da classe 1
 * }
 * 
 * public class Classe2 {
 * // codigo da classe 2
 * }
 * 
 * 
 * package com.exemple.projeto;
 * import com.exemple.outropacote.Classe3; --> importar classe de outro pacote 
 * 
 * public class Classe1 {
 *  // codigo classe 1
 * }
 * 
 * Modificador de acesso -> delimitam o privilegio do acesso entre as classes e pacotes 
 * 
 * package com.example.projeto;
 * 
 * public class Classe1{
 *      protected int atributoProtegido;
 *      int atributoDefault;
 *      //Resto do código
 * } 
 * 
 * private -> não deve acessar em nenhum lugar 
 * protected -> pertence a classe mãe e as demais filhas
 * public -> 
 * default -> 
 * 
 */

public class ModificadorAcesso {

}
