
package br.gov.servicos.v3.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDeCanalDePrestacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDeCanalDePrestacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="aplicativo-movel"/>
 *     &lt;enumeration value="e-mail"/>
 *     &lt;enumeration value="fax"/>
 *     &lt;enumeration value="postal"/>
 *     &lt;enumeration value="presencial"/>
 *     &lt;enumeration value="sms"/>
 *     &lt;enumeration value="telefone"/>
 *     &lt;enumeration value="web"/>
 *     &lt;enumeration value="web-acompanhar"/>
 *     &lt;enumeration value="web-agendar"/>
 *     &lt;enumeration value="web-calcular-taxas"/>
 *     &lt;enumeration value="web-consultar"/>
 *     &lt;enumeration value="web-declarar"/>
 *     &lt;enumeration value="web-emitir"/>
 *     &lt;enumeration value="web-inscrever-se"/>
 *     &lt;enumeration value="web-postos-de-atendimento"/>
 *     &lt;enumeration value="web-preencher"/>
 *     &lt;enumeration value="web-simular"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDeCanalDePrestacao")
@XmlEnum
public enum TipoDeCanalDePrestacao {

    @XmlEnumValue("aplicativo-movel")
    APLICATIVO_MOVEL("aplicativo-movel"),
    @XmlEnumValue("e-mail")
    E_MAIL("e-mail"),
    @XmlEnumValue("fax")
    FAX("fax"),
    @XmlEnumValue("postal")
    POSTAL("postal"),
    @XmlEnumValue("presencial")
    PRESENCIAL("presencial"),
    @XmlEnumValue("sms")
    SMS("sms"),
    @XmlEnumValue("telefone")
    TELEFONE("telefone"),
    @XmlEnumValue("web")
    WEB("web"),
    @XmlEnumValue("web-acompanhar")
    WEB_ACOMPANHAR("web-acompanhar"),
    @XmlEnumValue("web-agendar")
    WEB_AGENDAR("web-agendar"),
    @XmlEnumValue("web-calcular-taxas")
    WEB_CALCULAR_TAXAS("web-calcular-taxas"),
    @XmlEnumValue("web-consultar")
    WEB_CONSULTAR("web-consultar"),
    @XmlEnumValue("web-declarar")
    WEB_DECLARAR("web-declarar"),
    @XmlEnumValue("web-emitir")
    WEB_EMITIR("web-emitir"),
    @XmlEnumValue("web-inscrever-se")
    WEB_INSCREVER_SE("web-inscrever-se"),
    @XmlEnumValue("web-postos-de-atendimento")
    WEB_POSTOS_DE_ATENDIMENTO("web-postos-de-atendimento"),
    @XmlEnumValue("web-preencher")
    WEB_PREENCHER("web-preencher"),
    @XmlEnumValue("web-simular")
    WEB_SIMULAR("web-simular");
    private final String value;

    TipoDeCanalDePrestacao(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDeCanalDePrestacao fromValue(String v) {
        for (TipoDeCanalDePrestacao c: TipoDeCanalDePrestacao.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
