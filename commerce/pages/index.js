import Head from 'next/head'
import Header from '../components/common/header/index';
import DestaquesBanner from "../components/homepage/DestaquesBanner";
import CategoriasBanner from "../components/homepage/CategoriasBanner";
import MaisVendidoBanner from '../components/homepage/MaisVendidoBanner';
import PromocionalBanner from '../components/homepage/PromocionalBanner';
import Footer from '../components/common/Footer';
export default function Home() {
  return (
    <div>
      <Head>
        <title>Jotinha Store</title>
      </Head>
    <Header/>
      <main>
        <DestaquesBanner />
        <CategoriasBanner />
        <MaisVendidoBanner />
        <PromocionalBanner />
      </main>
    <Footer />
    </div>
  )
}
