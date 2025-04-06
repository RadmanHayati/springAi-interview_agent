package com.assistant.interviewer.component.mongo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

public class EnumToIntegerConverters {

	@WritingConverter
	public static class EnumToIntegerConverter implements Converter<Enum<?>, Object> {

		@Override
		public Object convert(Enum<?> source) {
			if (source instanceof IntEnumConvertable) {
				return ((IntEnumConvertable) (source)).getValue();
			} else {
				return source.name();
			}
		}

	}

}
