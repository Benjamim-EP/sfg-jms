package benjamim.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;


/**
 * Esta classe é responsável pela configuração do Spring para o JMS (Java Message Service).
 */
@Configuration
public class JmsConfig {

    /**
     * Este método cria e configura um MessageConverter que será usado para converter mensagens JMS em formato JSON.
     * 
     * @return Um MessageConverter configurado para converter mensagens em JSON.
     */

    public static final String MY_QUEUE = "my-hello-world";

    @Bean
    public MessageConverter messageConverter(){
        // Cria um MappingJackson2MessageConverter, que é um tipo de MessageConverter que converte mensagens em JSON.
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();

        // Configura o tipo de mensagem como TEXT, o que significa que as mensagens serão em formato de texto (JSON).
        converter.setTargetType(MessageType.TEXT);

        // Configura o nome da propriedade que será usada para identificar o tipo da mensagem no JSON.
        converter.setTypeIdPropertyName("_type");

        // Retorna o MessageConverter configurado.
        return converter;
    }
}
