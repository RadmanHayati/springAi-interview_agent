package com.assistant.interviewer.config;

import java.util.ArrayList;
import java.util.List;


import com.assistant.interviewer.component.mongo.converter.EnumToIntegerConverters;
import com.assistant.interviewer.component.mongo.converter.IntegerToEnumConverterFactory;
import com.assistant.interviewer.component.mongo.converter.IntegerToEnumConverterFactory.IntegerToEnum;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

@EnableMongoAuditing
@Configuration
public class MongoConfig {

	@Bean
	public MongoCustomConversions customConversions() {
		List<Converter<?, ?>> converters = new ArrayList<>();
		converters.add(new IntegerToEnum<>(null));
		converters.add(new EnumToIntegerConverters.EnumToIntegerConverter());
		return new MongoCustomConversions(converters);
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoDatabaseFactory mongoDbFactory) {
		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory);
		MappingMongoConverter mmc = (MappingMongoConverter) mongoTemplate.getConverter();
		mmc.setTypeMapper(new DefaultMongoTypeMapper(null));
		ConversionService convService = mmc.getConversionService();
		((GenericConversionService) convService).addConverterFactory(new IntegerToEnumConverterFactory());
		mmc.afterPropertiesSet();
		return mongoTemplate;
	}

}
