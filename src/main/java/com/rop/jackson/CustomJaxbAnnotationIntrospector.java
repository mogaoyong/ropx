package com.rop.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

public class CustomJaxbAnnotationIntrospector extends JaxbAnnotationIntrospector {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6452631254361798277L;

	public CustomJaxbAnnotationIntrospector(TypeFactory typeFactory) {
        super(typeFactory);
    }

    @Override
    public boolean hasIgnoreMarker(AnnotatedMember m) {
        if ( m.hasAnnotation(JsonIgnore.class) ) {
            return true;
        } else {
            return super.hasIgnoreMarker(m);
        }
    }
}