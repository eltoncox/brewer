package com.elton.brewer.thymeleaf;

import java.util.HashSet;
import java.util.Set;
import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.elton.brewer.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.elton.brewer.thymeleaf.processor.MessageElementTagProcessor;
import com.elton.brewer.thymeleaf.processor.OrderElementTagProcessor;
import com.elton.brewer.thymeleaf.processor.PaginationElementTagProcessor;

public class BrewerDialect extends AbstractProcessorDialect {

	public BrewerDialect() {
		super("AlgaWorks", "brewer", StandardDialect.PROCESSOR_PRECEDENCE);
	}	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<IProcessor>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		return processadores;
	}
}





