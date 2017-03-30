package di.univaq.MOSQUITO.trasformation.qnhwTrasformation;

import di.univaq.MOSQUITO.utility.LogManager;
import PmifSchema.PmifSchemaFactory;
import PmifSchema.QNMType;



public abstract class OutputSection {
	
	protected QNMType qn;

	protected PmifSchemaFactory pmif;
	
	protected LogManager log;
	
	
	public OutputSection(QNMType qn, PmifSchemaFactory pmif, LogManager log) {
		this.qn = qn;
		this.pmif = pmif;
		this.log = log;
	}

}
