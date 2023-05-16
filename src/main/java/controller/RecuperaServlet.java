package controller;
import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Hotel;

@WebServlet("/recupera.do")
public class RecuperaServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, 
                HttpServletResponse response) 
             throws IOException, ServletException {
/* Iniciando um vetor de usuários para simular um Banco de Dados */
		ArrayList<Hotel> bd = new ArrayList<Hotel>();
		bd.add(new Hotel(1,"Renaissance São Paulo Hotel","São Paulo, SP","Viajar deve ser algo inspirador, e inspiração é exatamente o que você encontrará nas propriedades Renaissance Hotels em todo o mundo. Escolha entre hotéis históricos, boutiques elegantes ou resorts de luxo. Descubra a cena local com a ajuda dos Navigators locais. Além disso, desfrute de lounges nos lobbies, bares e restaurantes dinâmicos com os eventos RLife","4.7/5","https://marriottclk.koddi.com/clk?destination=https://ad.doubleclick.net/clk;269275299;95398642;k;u%3Dkoddi%26sv2%3Dkoddi_hpa_BR_SAOBR_localuniversal_1_desktop_07/07/2023___default___organic?https://www.marriott.com.br/reservation/availabilitySearch.mi?scid%3D20130228T121101000006%26pid%3D%26isSearch%3Dfalse%26propertyCode%3DSAOBR%26fromDate%3D07/07/2023%26toDate%3D08/07/2023%26numberOfRooms%3D1%26numberOfGuests%3D2%26currency%3DBRL"));
		bd.add(new Hotel(2,"Sheraton São Paulo WTC Hotel","São Paulo, SP","O Sheraton São Paulo WTC Hotel oferece 298 apartamentos com alto padrão de conforto e os melhores serviços de hotelaria de luxo brasileira, além de ter as maiores suítes da categoria na região e mais de 60 apartamentos decorados por arquitetos renomados.","4.6/5","https://www.marriott.com.br/reservation/availabilitySearch.mi?scid=20130228T121101000006&isSearch=false&propertyCode=SAOSI&fromDate=07%2F07%2F2023&toDate=08%2F07%2F2023&numberOfRooms=1&numberOfGuests=2&currency=BRL%26&dclid=CNuRoL6M9v4CFTehlQIdpB4Gew"));
		bd.add(new Hotel(3,"Bourbon Convention Ibirapuera","São Paulo, SP","Localizado em Moema, ao lado do Shopping Ibirapuera e da estação de metrô Eucaliptos, o Hotel oferece facilidades para quem busca conforto e comodidade, atendimento de qualidade e serviços completos. Com ampla recepção, além de recuo para embarque e desembarque de ônibus e vans, o hotel é a opção ideal para realização de eventos, hospedagem de grupos e para pessoas que estão na cidade de São Paulo a negócios ou lazer.","4.5/5","https://www.trivago.com.br/pt-BR/srl?iSemThemeId=58890&search=100-1076986;dr-20230618-20230619;rc-1-2&adType=gha_paid&iDisp=26&sLanguageLocale=BR&sCurrencyCode=BRL&iGhaThemeId=1&ghaDevice=desktop&ghaDateType=default&ghaPrice=324.64&ghaSite=localuniversal&ghaGroup=10270&ghaArr=20230618&ghaDep=20230619&ghaABW=35&ghaList=&ghaCtx=CIsDEKcpGPHD-czMtISIygEg4p3_2fr_____ASoiCiAwMDAwMDAxNjg0MTA3NTAzYjk1ZjUyYWExNDkxMGM3ODIgMDAwMDAwMTY4NDEwNzY1OGVmNzNjZGMxNThmZjlhMTg4-t1B&cipc=sem&cip=5514000000&ghaAdg=115006419578&ghaCam=2075364916&gclid=CjwKCAjwjYKjBhB5EiwAiFdSfsGRAe2wk8luIkapUAifSF2zBGt0LN8VPCd8ryLqH21n5LhKM-XGixoC8uEQAvD_BwE"));
		bd.add(new Hotel(4,"Blue Tree Premium Paulista","São Paulo, SP"," O Blue Tree Premium Paulista oferece 240 confortáveis apartamentos divididos nas seguintes categorias: Superior, Luxo, Luxo Premier, Suíte Premium e Suíte Executiva. Todos são equipados com estação de trabalho e conexão para internet além da vista para as Avenidas Paulista ou MASP.","4.5/5","https://book.omnibees.com/hotelresults?q=1042&NRooms=1&CheckIn=09072023&CheckOut=10072023&ad=2&ch=0&ag&group_code&Code&loyalty_code&lang=pt&currencyId=BRL&version=4"));
		bd.add(new Hotel(5,"Blue Tree Premium Morumbi","São Paulo, SP","O Blue Tree Premium Morumbi é um hotel moderno e com atenção aos detalhes. Para o conforto e praticidade de sua viagem à São Paulo, o hotel está localizado em frente aos Shoppings Morumbi e Market Place, e ao lado da região de escritórios da Berrini. A infraestrutura completa e os serviços com a qualidade Blue Tree vão tornar sua estada ou evento ainda mais especial.","4.4/5","https://book.omnibees.com/hotelresults?q=1054&NRooms=1&CheckIn=23062023&CheckOut=24062023&ad=2&ch=0&ag&group_code&Code&loyalty_code&lang=pt&currencyId=BRL&version=4"));
		bd.add(new Hotel(6,"Comfort Ibirapuera","São Paulo, SP","O Comfort Ibirapuera possui 79 confortáveis e aconchegantes apartamentos. Oferece também facilidades como fitness center, piscina com solarium e deslumbrante vista de São Paulo, room-service até às 23 horas, restaurante, recepção 24 horas e sala para eventos até 35 pessoas.","4.4/5","https://atlantica.letsbook.com.br/d/Reserva?idgoogle=82967ee810a35a244969db5bf708795f&checkin=25%2f05%2f2023&checkout=26%2f05%2f2023&adultos=2"));
		bd.add(new Hotel(7,"Golden Tulip Paulista Plaza","São Paulo, SP"," O Hotel Golden Tulip Paulista Plaza dispõe de 371 apartamentos com varanda, reformados e divididos em três categorias – todas elas, porém, usufruindo do serviço impecável e uma excelente estrutura de fitness, lazer e negócios.","4.4/5","https://www.radissonhotelsamericas.com/en-us/booking/room-display?hotelCode=BRAPLBR&facilitatorId=GOOGLEHPAAMERICAS&checkInDate=2023-06-25&checkOutDate=2023-06-26&adults%5B%5D=2&children%5B%5D=0&searchType=lowest&currencyCode=BRL&testClick=false&cid=a:mt+b:gha+c:amer+d:BR+e:rad+g:ho+h:BRAPLBR+i:ghameta+r:desktop+&content=gha_CARLSON-BRAPLBR_BR_desktop_1_2023_06_25_default_13244743353__standard&hmGUID=57518a8f-827c-426c-92ab-26f502fac566"));
		bd.add(new Hotel(8,"Mercure São Paulo Pamplona Hotel","São Paulo, SP","Se você procura um hotel em São Paulo confortável para sua viagem de negócios ou aproveitar a cidade ao máximo, o Mercure São Paulo Pamplona é para você. Os quartos são espaçosos e tem uma decoração moderna, com opções de room office. Todos climatizados e com wi-fi grátis. O Restaurante Le Jadys serve o melhor da cozinha internacional em um agradável ambiente. Faça sua reunião na equipada sala de eventos, e aproveite a área de lazer completa com piscina, academia e sauna para relaxar.","4.3/5","https://all.accor.com/ssr/app/accor/rates/6284/index.pt-br.shtml?token=q0KIJoakqm_856IouqA7unHHjTqeCdx5ipsozRaFGDnb4JK2GAsmTVIVffjrTOZKZLYRp4rov3CO5Fdvb13y3E3iXNAxhla77ezZv2qpFf5_BoRCqU7BsXN5hy7OOcQb2xgwwRMdeVlsPQJK2ulC24zybcgmuYBrOOXiSdIP-8ny_7ez0Tq1hCf6PXyFt1wrVVG-pBkEF26MNCrG30BgITSHrHGkST9vZy0o1ZF3uDIrBE3uqf16Dz38x3PYrVznRTEwu9nlP6pRHiLSDGRGmgqIhd3A5WkaBOyDBffsi6gSUqyjB6baSskAtKOnO7wpQdM8XIhQp5UsKnNcTIz9xhjE5GJ0oxsLkKJCaCpEvRlHQi750LvkboyRdeErA8P3KWGbtxgCdUoDZSGpfHaHkSot5CyEcmh0Xmy7hGgAwtfnXv6GvzgFN5-fo7MMvDSM6nBEf4SigCm_mACk8SgJdqc4eRzM3mWW_H4lL597dpgNuu1nr7CxHYG67270__AhgX3SDR8WKudx8RqSMHXw7urNKoTXj9WwtHdBRHKGrq3Is-Vi0xM4BSAoEh_LfXADStS2yX2OqcR9XFE20NxIDdOOFEyA3B4_aCqfVz7HrLas0jI58-LkU8eNEn7WFD6FRefYel8mOq45fsycZshQ0QvBq5E088h0PMVGcr2RR90hFjO8UMX0rVGFsTVHs6XMhqNUFdNp2TiOV8a1yhho6-9cLiRbBX0VjaMJhMlFzyMogXkVW2Th2Nnm1JsRhOTxF_xJbPD6KtYbna3WEIsFn-u1mvhDYv29Xm7Kswzk3k10GCFE7826wG-MxO2AEe8kMCTXIh3_NHCYrGl_p1K4mZPulcy-G1pnnWvTLrLA4ptVHJxV9QWHwQu8xzGk4WSSmHP_IkMknw-xEYud_R_45rLDVAscxMw_Kup7FYmnY1OSklMFXUVEOAd0944LFcoCq5tXZhZRvWH8YXtGgIJU0MnnY0vCwDejLZ-dKLy9aLDqg-P7S4eXxcVF-5WD8v2LkO2HRDYsDMlg1-ApmPEUXH8dMsyA7TeQ-tOMo_Ao2oDKWXMw7YDJaHI7LZ7a7NDZH7FSqmCQcxi5pxlxX9HyYgUcOrblzGcnp02HbAuz_1oq9_mfnb8BzFwQRCobD2K4kGSHIY7bHao_feAwCEEEjNiMx8EcuMa-Idav-lLPoxw1WATkE0AMO6ibD3q2ZKsIeP07JppdF4P-5OkElub6Nz8UyPtIJbopUI6mgjzTSqeE0xbo_Gn_AUpUN7BMFV4MfdcKiIEOd7xhnVhGUF73cFzr90tqew_N-WLphopwtGOLhWSSQED7krXzK06rJ5z5qZeVPpMcsoXXK2iB5KCjvrkb1yCl6CH4zSEXbjSrRHwF3E2IUFET6jSlOhOH_7Kwp1T2CGFx9aaBCQ6bLokR72THWFg&dateIn=2023-05-21&nights=1&compositions=2&stayplus=false&snu=false&accessibleRooms=false&gclid=CjwKCAjwjYKjBhB5EiwAiFdSfjyC8KpLzd6n9R_bxSfRn1TkrBztqkX-ZxfuRI4kYShKW1q9BoOjFRoCj8gQAvD_BwE&utm_campaign=6284-BR-cpc-desktop-default-0--localuniversal-15648466237-0-0-1&utm_medium=partenariats&hmGUID=57518a8f-827c-426c-92ab-26f502fac566&utm_source=Google%20Hotel%20Ads"));
		bd.add(new Hotel(9,"Ibis Styles São Paulo Anhembi","São Paulo, SP","Com um design criativo, baseado no tema \"aviação\", o ibis Styles São Paulo Anhembi une a praticidade para o trabalho com um espaço receptivo para família por uma ótima relação custo-benefício. Os quartos são bastante confortáveis e adaptados para pessoas com mobilidade reduzida, com WIFI e ar condicionado. O restaurante 14 Bis serve um pequeno-almoço com 40 opções gastronómicas, área de bar 24 horas. Espaço para crianças. Cães são bem-vindos.","4.3/5","https://all.accor.com/hotel/9596/index.pt.shtml?dateIn=&nights=&compositions=1&stayplus=false&snu=false#origin=ibis"));
		
/* Simulando a recuperação do banco (só que no vetor)*/
		
		// recuperando o ID da requisição
		int id = Integer.parseInt(
                           request.getParameter("id"));
		Hotel result = null;
		for (Hotel user : bd) {
			if (user.getId() == id) {
				result = user;
				break;
			}
		}
/* Definindo qual página será exibida em função do que foi recuperado */
		String paginaDestino;
		if (result != null) {
			request.setAttribute("Hotel", result);
			paginaDestino ="/info.jsp";
		}
		else {
			request.setAttribute("Mensagem", "Este ID não existe.");
			request.setAttribute("Recomendacao", "Pesquise por outro ID!");
			paginaDestino  ="/erro.jsp";
		}
		
			RequestDispatcher dispatcher = 
                     	getServletContext()
                     	.getRequestDispatcher(paginaDestino);
			dispatcher.forward(request, response);
		}
}