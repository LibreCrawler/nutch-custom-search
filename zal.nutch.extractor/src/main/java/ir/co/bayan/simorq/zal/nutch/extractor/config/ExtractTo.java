package ir.co.bayan.simorq.zal.nutch.extractor.config;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;

/**
 * 
 * @author Taha Ghasemi <taha.ghasemi@gmail.com>
 * 
 */
public class ExtractTo {

	@XmlIDREF
	@XmlAttribute
	private Field field;

	@XmlElementRef
	private Function value;

	public Field getField() {
		return field;
	}

	/**
	 * @return the value
	 */
	public Function getValue() {
		return value;
	}

}