package com.rongdu.cashloan.core.common.util.factory;

import com.rongdu.cashloan.core.common.exception.ObjectNotFoundException;

/**
 * 对象工厂
 * @author FHJ
 *
 * @param <T>
 */
public interface ObjectFactory<T> {
	/**
	 * 从工厂中获取对象
	 * @param qualifier 限定符
	 * @return
	 * @throws ObjectNotFoundException
	 */
	T getObject(Object qualifier) throws ObjectNotFoundException;
}
