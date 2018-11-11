# spring boot SOAP with MySQL

# cara menjalankan 

`$ mvn clean package spring-boot:run`

# cara test soap dengan postman

masuk ke postman, pilih tab body, kemudian rubah extension text/xml,<br/>
kemudian copas url --> `http://localhost:8080/soapWS/nasabah.wsdl`,<br/>
lalu copas script dibawah ini <br/>
`
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" 
  xmlns:art="http://myhost.com/spring-soap/nasabah-ws">
   <soapenv:Header/>
   <soapenv:Body>
      <art:getRequestNasabahAll/>
   </soapenv:Body>
</soapenv:Envelope> 
`
<br/>
di dalam body text/xml, kemudian rubah methodnya menjadi POST <br/>
<br/>
jika berhasil maka outputnya seperti dibawah ini <br/><br/>
`
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Header/>
    <SOAP-ENV:Body>
        <ns2:getResponseNasabahAll xmlns:ns2="http://myhost.com/spring-soap/nasabah-ws">
            <ns2:nasabahInfo>
                <ns2:nasabahId>1</ns2:nasabahId>
                <ns2:name>muhammad dicka nirwansyah</ns2:name>
                <ns2:category>bank mandiri</ns2:category>
            </ns2:nasabahInfo>
        </ns2:getResponseNasabahAll>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
`

