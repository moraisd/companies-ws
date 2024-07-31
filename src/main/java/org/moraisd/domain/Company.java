package org.moraisd.domain;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import org.bson.codecs.pojo.annotations.BsonProperty;

@Getter
@MongoEntity(collection = "companies")
public class Company extends PanacheMongoEntity {

    @BsonProperty("Symbol")
    public String symbol;
    @BsonProperty("Sector")
    public String sector;
    @BsonProperty("Industry")
    public String industry;
    @BsonProperty("Currency")
    public String currency;
    @BsonProperty("EBITDA")
    public long ebitda;
    @BsonProperty("MarketCapitalization")
    public long marketCapitalization;
    @BsonProperty("PERatio")
    public float peRatio;
    @BsonProperty("EVToEBITDA")
    public float evToEbitda;
    @BsonProperty("OperatingCashFlow")
    public long operatingCashFlow;
    @BsonProperty("CapitalExpenditures")
    public long capitalExpenditures;
    @BsonProperty("SharesOutstanding")
    public String sharesOutstanding;


}
