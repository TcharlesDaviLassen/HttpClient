# HttpClient

## Gson
É altamente personalizável. Podemos usar GsonBuilder para construir uma instância Gson quando precisamos definir opções de configuração diferentes do padrão.
Existem muitos métodos interessantes fornecidos por GsonBuilder para definir a configuração personalizada para a instância Gson. A lista completa pode ser vista aqui.
O exemplo a seguir mostra como usar o GsonBuilder para construir uma instância Gson usando os seguintes métodos:

 - serializeNulls() : Por padrão, o Gson exclui todos os campos nulos durante a serialização.
<br />
<br />
- setPrettyPrinting() : Este método configura o Gson para gerar JSON para impressão bonita.
<br />
<br />
 - setFieldNamingStrategy(FieldNamingStrategy) : Este método configura o Gson para aplicar uma estratégia de política de nomenclatura específica ao campo de um objeto durante a serialização e desserialização.

O Gson não requer modificações adicionais nas classes de objetos serializados/desserializados, pois usa reflexão.

O Gson não pode serializar nenhum campo transitório, pois uma palavra-chave transitória em Java indica que um campo não deve ser serializado.

Gson não funcionará em objetos com referências recursivos.

Gson requer que a classe tenha um construtor padrão sem argumentos. Se o construtor no-args não for fornecido, podemos registrar um InstanceCreator com Gson, permitindo desserializar instâncias de classes.
