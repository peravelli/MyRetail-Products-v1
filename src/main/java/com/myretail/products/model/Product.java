package com.myretail.products.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @NotNull
    @JsonProperty("product_id")
    private String _id;
    @NotNull
    @JsonProperty("value")
    private String price;
    @JsonProperty("currency_code")
    private String currencyCode;

}
