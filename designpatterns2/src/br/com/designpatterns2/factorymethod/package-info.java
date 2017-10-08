/**
 * 
 */
/**
 * FACTORY
 * 
 *  Qual a diferença entre o padrão Factory e o Builder ? 

 * 	Ambos são padrões de projeto que visam resolver problemas de criação de objetos. 
 *	O que muda de um pro outro é basicamente a semântica.

 *	Geralmente usamos um builder quando precisamos passar diversas informações para a lógica 
 *  que monta o objeto. No caso da Nota Fiscal, passamos nome, ítens, etc.

 *	Usamos uma fábrica quando temos que isolar o processo de criação de um objeto em 
 *	um único lugar. Essa fábrica pode descobrir como criar o objeto dentro dela própria,
 *	mas geralmente ela não precisa de muitas informações para criar o objeto.

 * 
 * 
 * 
 * 
 * 
 *
 */
package br.com.designpatterns2.factorymethod;