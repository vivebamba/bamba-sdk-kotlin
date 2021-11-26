
# PaymentParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mediaTypeKey** | **kotlin.String** | Media type key to make the payment, available options CARD, TOKEN, PHONE_NUMBER, EMAIL, CLABE, CACAO, CUSTOMER_NUMBER, ACCOUNT_NUMBER | 
**mediaTypeValue** | **kotlin.String** | The value for the selected media type, example if mediaTypeKey is EMAIL here it goes customer@domain.com, also the tokenized card from payment gateways like OPENPAY | 
**mediaDeviceId** | **kotlin.String** | Needed for antifraud system, it is the device id from where the request is being sent |  [optional]
**installments** | **kotlin.String** | Intended for MSI (for is acronym in spanish) specification in the payment. |  [optional]



