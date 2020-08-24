from rest_framework.views import APIView
from rest_framework.response import Response

from services.emojifier import api

# Create your views here.
class Index(APIView):
    def post(self, request):
        content = request.data['data']
        emoji = api.predict(content)

        context = {
            'emoji': emoji
        }

        return Response(context)
