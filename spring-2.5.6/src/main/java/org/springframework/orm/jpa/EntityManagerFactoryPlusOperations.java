/*
 * Copyright 2002-2006 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.orm.jpa;

/**
 * Interface that defines common operations beyond the standard
 * JPA EntityManagerFactory interface, in a vendor-independent fashion.
 * To be adapted to specific JPA providers through a JpaDialect.
 *
 * <p>As of Spring 2.0, this interface does not define any operations yet.
 * The pass-through mechanism to the underlying JpaDialect is already in
 * place. Concrete operations will be added in the Spring 2.5 timeframe.
 *
 * @author Rod Johnson
 * @since 2.0
 * @see JpaDialect#getEntityManagerPlusOperations
 * @see javax.persistence.EntityManagerFactory
 */
public interface EntityManagerFactoryPlusOperations {

}
