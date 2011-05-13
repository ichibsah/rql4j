/**
 * <p>
 *     This package contains the classes to create the rql-statement. All classes extend the abstract class
 *     {@link RqlBuilder} which contains the execute method. The execute method is used by the
 *     {@link rql4j.cms.RqlCommand} to execute the rql-statement and store the result. {@link RqlBuilder} cotains inner
 *     classes which represent the action which should perform.
 * </p>
 * <p>
 *     The classes to build the rql-statement have a analogy to the official rql documentation. The builder to create
 *     a rql-statement to list all categories of a project for example is {@link CategoriesBuilder.List}.
 * </p>
*/
package rql4j.builder;