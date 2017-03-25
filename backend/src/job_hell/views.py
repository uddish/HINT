from django.shortcuts import render
from django.shortcuts import render
from django.http import HttpResponseRedirect, JsonResponse
from django.views.decorators.csrf import csrf_exempt
from .utlis.nn import predict 
# Create your views here.

@csrf_exempt
def get_score(request):
	if request.method == 'POST':
		data = request.POST['data']
		score = predict(data)
		return JsonResponse({'score':score})
	else:
		return render(request, "main/thing.html")
		return JsonResponse({'Error':'No POST request'})
	