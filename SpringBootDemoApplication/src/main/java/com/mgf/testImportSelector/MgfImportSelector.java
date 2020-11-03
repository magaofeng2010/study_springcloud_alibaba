package com.mgf.testImportSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * 创建一个 ImportSelector 实现类 
 * @author flp
 *
 */
public class MgfImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		
		return new String[] {FirstClass.class.getName(),SecondClass.class.getName()};
	}
   
}
