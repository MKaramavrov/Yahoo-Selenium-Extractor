# Yahoo Bitcoin's Price Selenium extractor

### Project's description:
Using Selenium we need to find Bitcoin's page from Yahoo home page and after clicking into it to 
extract price and save it to the MongoDB using Morphia.<br>
3 models are present: 
* FirstCollection, which has id, start time and lunch's duration;
* SecondCollection, which has id, test's name, stock price and test time;
* FirstCollectionGrouped, which has 2 fields: id and items(list of FirstCollection).



### Project's features:
- Opening Yahoo homepage and extracting required data
- save needed info
- get required info
- group info by special fields.
