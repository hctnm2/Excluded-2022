import requests
import json

def get_quote():
  response = requests.get("https://zenquotes.io/api/random")
  json_data = json.loads(response.text)
  quote = json_data[0]['q'] + '\n\n' + " -" + json_data[0]['a']
  return(quote)

quote = get_quote()

print("Here's your quote!")
print(' ')
print(quote)
